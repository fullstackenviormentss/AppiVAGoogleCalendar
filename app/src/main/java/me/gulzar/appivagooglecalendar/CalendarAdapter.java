package me.gulzar.appivagooglecalendar;

/**
 * Created by Gulzar on 17-03-2017.
 */

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.iconics.IconicsDrawable;

import java.util.List;

import static java.security.AccessController.getContext;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.MyViewHolder> {

    private List<CalendarEvents> calendarEventsList;
    Typeface font;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, date, description;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            description = (TextView) view.findViewById(R.id.description);
            date = (TextView) view.findViewById(R.id.date);
        }
    }


    public CalendarAdapter(List<CalendarEvents> calendarEventsList) {
        this.calendarEventsList = calendarEventsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calendar_list_row, parent, false);
        font = Typeface.createFromAsset(
                itemView.getContext().getAssets(),
                "font/Montserrat-Regular.ttf");
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CalendarEvents calendarEvents = calendarEventsList.get(position);
        holder.name.setText(calendarEvents.getName());
        holder.name.setCompoundDrawables(null, null,new IconicsDrawable(holder.name.getContext(),FontAwesome.Icon.faw_calendar).actionBar().color(Color.GRAY),null);
        holder.description.setText(calendarEvents.getDescription());

        holder.name.setTypeface(font);
        holder.date.setText(calendarEvents.getDate());
    }

    @Override
    public int getItemCount() {
        return calendarEventsList.size();
    }
}

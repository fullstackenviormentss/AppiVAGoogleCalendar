package me.gulzar.appivagooglecalendar;

/**
 * Created by Gulzar on 17-03-2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.MyViewHolder> {

    private List<CalendarEvents> calendarEventsList;

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

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CalendarEvents movie = calendarEventsList.get(position);
        holder.name.setText(movie.getName());
        holder.description.setText(movie.getDescription());
        holder.date.setText(movie.getDate());
    }

    @Override
    public int getItemCount() {
        return calendarEventsList.size();
    }
}

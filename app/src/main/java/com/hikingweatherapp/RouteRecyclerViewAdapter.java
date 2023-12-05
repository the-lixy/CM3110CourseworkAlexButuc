package com.hikingweatherapp;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/*public class RouteRecyclerViewAdapter extends RecyclerView.Adapter<RouteRecyclerViewAdapter.RouteViewHolder> {
        private Context context;

        private List<allRoutes> routes;

        public RouteRecyclerViewAdapter(Context context, List<routes>){
            this.context = context;
            this.routes = routes;
        }
    } */
public class RouteRecyclerViewAdapter extends RecyclerView.Adapter<RouteViewHolder>{

    private Context context;
    private List<allRoutes> routes;

    public RouteRecyclerViewAdapter(Context context, List<allRoutes> routes){
        super();
        this.context = context;
        this.routes = routes;
    }

    @NonNull
    @Override
    public RouteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RouteViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

    class RouteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private View routeItemView;
        private RouteRecyclerViewAdapter adapter;

        public RouteViewHolder(View routeItemView, RouteRecyclerViewAdapter adapter) {
            super(routeItemView);
            this.routeItemView = routeItemView;
            this.adapter = adapter;
            // add a listener to the button in the routeItemView
            routeItemView.findViewById(R.id.favourite_route_button).setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            // get the clicked item's position
            int position = getAdapterPosition();

            // get the route at that position
            allRoutes routes = null;
            allRoutes route = routes.getRoutename();

            // do something with task
            Log.d("TASK_RECYCLER",
                    "user clicked on task " +
                           route.getRoutename());
        }

}

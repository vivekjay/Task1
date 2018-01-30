package com.example.vijay.task1;


import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Dell on 1/29/2018.
 */

public class UsersRecyclerAdapter extends RecyclerView.Adapter<UsersRecyclerAdapter.UserViewHolder> {

    private List<BeanClass> listUsers;

    @Override
    public UsersRecyclerAdapter.UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user_recycler, parent, false);
        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.textViewName.setText(listUsers.get(position).getUsername());
        holder.textViewEmail.setText(listUsers.get(position).getEmailid());
        holder.textViewPassword.setText(listUsers.get(position).getPassword());

    }

    @Override
    public int getItemCount() {
        Log.v(UsersRecyclerAdapter.class.getSimpleName(),""+listUsers.size());
        return listUsers.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        public AppCompatTextView textViewName;
        public AppCompatTextView textViewEmail;
        public AppCompatTextView textViewPassword;

        public UserViewHolder(View itemView) {
            super(itemView);

            textViewName = (AppCompatTextView) itemView.findViewById(R.id.textViewName);
            textViewEmail = (AppCompatTextView) itemView.findViewById(R.id.textViewEmail);
            textViewPassword = (AppCompatTextView) itemView.findViewById(R.id.textViewPassword);
        }
    }
}

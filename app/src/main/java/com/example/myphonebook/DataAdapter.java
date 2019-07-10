package com.example.myphonebook;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<BookPhone> phones;

    DataAdapter(Context context, List<BookPhone> phones) {
        this.phones = phones;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        BookPhone phone = phones.get(position);
        holder.phoneView.setText(phone.getCompany());
    }

    @Override
    public int getItemCount() {
        return phones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        final TextView nameView, phoneView;
        ViewHolder(View view){
            super(view);

            nameView = (TextView) view.findViewById(R.id.name);
            phoneView = (TextView) view.findViewById(R.id.phone);
        }
    }
}
package ws.wolfsoft.feedme_profile;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vaibhav on 25-Jul-18.
 */

public class Nevigation_Adapter extends RecyclerView.Adapter<Nevigation_Adapter.ViewHolder> {

    private Context context;
    private ArrayList<Nevigation_Model> nevigation_models;

    public Nevigation_Adapter(Context context, ArrayList<Nevigation_Model> nevigation_models) {
        this.context = context;
        this.nevigation_models = nevigation_models;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nevigation,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.imagehistory.setImageResource(nevigation_models.get(position).getImagehistory());
        holder.image1.setImageResource(nevigation_models.get(position).getImage1());

        holder.tv1.setText(nevigation_models.get(position).getTv1());

    }

    @Override
    public int getItemCount() {return nevigation_models.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv1;
        ImageView imagehistory,image1;


        public ViewHolder(View itemView) {
            super(itemView);


            tv1 = itemView.findViewById(R.id.tv1);

            imagehistory = itemView.findViewById(R.id.imagehistory);
            image1 = itemView.findViewById(R.id.image1);
        }
    }
}

package com.sova.mytestingapplication;

    import android.content.Context;
    import android.support.v4.content.ContextCompat;
    import android.support.v7.widget.RecyclerView;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.Button;
    import android.widget.ImageView;
    import android.widget.TextView;

    import java.util.List;

    import at.blogc.android.views.ExpandableTextView;

    /**
     * Created by teach on 29.05.2017.
     */

    public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.MyViewHolder>{

        public Context context;
        public int numberOfItems = 20;

        public MyListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, int position) {
            holder.myImage.setImageResource(R.mipmap.ic_launcher);
            String str = "";
            for (int i = 0; i < 10; i++)
                str += "Example item " + position + "\n";
            holder.myText.setText(str);
            holder.myContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    holder.myText.toggle();
                }
            });
        }

        @Override
        public int getItemCount() {
            return 20;
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder {

            public ViewGroup myContainer;
            public ImageView myImage;
            public ExpandableTextView myText;

            public MyViewHolder(View itemView) {
                super(itemView);

                myContainer = (ViewGroup) itemView.findViewById(R.id.myContainer);
                myImage = (ImageView) itemView.findViewById(R.id.myImage);
                myText = (ExpandableTextView) itemView.findViewById(R.id.myText);
            }
        }
    }



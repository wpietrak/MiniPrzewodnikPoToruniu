package pl.wojciechpietrak.miniprzewodnikpotoruniu;


import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private String [] name;
    private String[] description;
    private int[] imageIds;

    private Listener listener;

    public static interface Listener {
        public void onClick(int position);
    }

    // samo zaimplementowało 3 metody i podpowiedział że trzeba utworzyć klasę View Holder z
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }

    public RecyclerViewAdapter(String[] name, String[] description, int[] imageIds) {
        this.name = name;
        this.imageIds = imageIds;
        this.description = description;
    }

    public void setListener(Listener listener){
        this.listener = listener;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.card_view_image);
        Drawable drawable = cardView.getResources().getDrawable(imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(name[position]);
        TextView textViewName = (TextView)cardView.findViewById(R.id.card_view_name);
        textViewName.setText(name[position]);
        TextView textViewDes = (TextView)cardView.findViewById(R.id.card_view_description);
        textViewDes.setText(description[position]);
        textViewDes.setMovementMethod(new ScrollingMovementMethod());

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null){
                    listener.onClick(position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return name.length;
    }


}

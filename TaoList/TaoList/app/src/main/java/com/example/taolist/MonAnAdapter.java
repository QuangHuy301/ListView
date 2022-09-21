package com.example.taolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<MonAn> monAnList;

    public MonAnAdapter(Context context, int layout, List<MonAn> monAnList) {
        this.context = context;
        this.layout = layout;
        this.monAnList = monAnList;
    }

    @Override
    public int getCount() {
        return monAnList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        TextView txtTen = (TextView) view.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.textviewmota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        TextView txtGia = (TextView) view.findViewById(R.id.textviewGia);
        ImageView imgCong = (ImageView) view.findViewById(R.id.imgCong);
        ImageView imgTru = (ImageView) view.findViewById(R.id.imgTru);

        MonAn monAn = monAnList.get(i);

        txtTen.setText(monAn.getTen());
        txtMoTa.setText(monAn.getMoTa());
        imgHinh.setImageResource(monAn.getHinh());
        txtGia.setText(monAn.getGia());
        imgCong.setImageResource(monAn.getCong());
        imgTru.setImageResource(monAn.getTru());

        return view;
    }
}

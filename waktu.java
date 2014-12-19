//ini fungsi untuk menampilkan tahun saja, kalau mau ganti ke bulan silahkan ganti int year = calendar.get(Calendar.YEAR); <-------
TextView teks = (TextView) findViewById(R.id.string);
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            if (year == 2015){
            teks.setText("Selamat datang di 2015");
            }else{
            teks.setText("Halo 2014 heheheh");	
            }

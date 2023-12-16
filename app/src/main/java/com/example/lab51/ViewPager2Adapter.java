package com.example.lab51;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
public class ViewPager2Adapter extends FragmentStateAdapter {
    public ViewPager2Adapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Trả về Fragment tương ứng với vị trí (position)
        // Ví dụ: Trả về HomeFragment cho vị trí 0 và NewsFragment cho vị trí 1
        if (position == 0) {
            return new HomeFragment();
        } else {
            return new NewFragment();
        }
    }

    @Override
    public int getItemCount() {
        // Số lượng tab hoặc số lượng Fragment bạn muốn hiển thị trong ViewPager2
        return 2; // Trong trường hợp này, có 2 tab (Home và News)
    }
}

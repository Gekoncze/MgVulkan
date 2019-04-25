package cz.mg.vulkan;

public class VkColorSpaceKHR extends VkEnum {
    public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT = 1000104001;
    public static final int VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT = 1000104002;
    public static final int VK_COLOR_SPACE_DCI_P3_LINEAR_EXT = 1000104003;
    public static final int VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT = 1000104004;
    public static final int VK_COLOR_SPACE_BT709_LINEAR_EXT = 1000104005;
    public static final int VK_COLOR_SPACE_BT709_NONLINEAR_EXT = 1000104006;
    public static final int VK_COLOR_SPACE_BT2020_LINEAR_EXT = 1000104007;
    public static final int VK_COLOR_SPACE_HDR10_ST2084_EXT = 1000104008;
    public static final int VK_COLOR_SPACE_DOLBYVISION_EXT = 1000104009;
    public static final int VK_COLOR_SPACE_HDR10_HLG_EXT = 1000104010;
    public static final int VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT = 1000104011;
    public static final int VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT = 1000104012;
    public static final int VK_COLOR_SPACE_PASS_THROUGH_EXT = 1000104013;
    public static final int VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT = 1000104014;

    public VkColorSpaceKHR() {
    }

    public VkColorSpaceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkColorSpaceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkColorSpaceKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COLOR_SPACE_SRGB_NONLINEAR_KHR) return "VK_COLOR_SPACE_SRGB_NONLINEAR_KHR";
        if(getValue() == VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT) return "VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT) return "VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_DCI_P3_LINEAR_EXT) return "VK_COLOR_SPACE_DCI_P3_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT) return "VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_BT709_LINEAR_EXT) return "VK_COLOR_SPACE_BT709_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_BT709_NONLINEAR_EXT) return "VK_COLOR_SPACE_BT709_NONLINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_BT2020_LINEAR_EXT) return "VK_COLOR_SPACE_BT2020_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_HDR10_ST2084_EXT) return "VK_COLOR_SPACE_HDR10_ST2084_EXT";
        if(getValue() == VK_COLOR_SPACE_DOLBYVISION_EXT) return "VK_COLOR_SPACE_DOLBYVISION_EXT";
        if(getValue() == VK_COLOR_SPACE_HDR10_HLG_EXT) return "VK_COLOR_SPACE_HDR10_HLG_EXT";
        if(getValue() == VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT) return "VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT) return "VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_PASS_THROUGH_EXT) return "VK_COLOR_SPACE_PASS_THROUGH_EXT";
        if(getValue() == VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT) return "VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkColorSpaceKHR implements cz.mg.collections.array.ReadonlyArray<VkColorSpaceKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkColorSpaceKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkColorSpaceKHR o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkColorSpaceKHR get(int i){
            return new VkColorSpaceKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}

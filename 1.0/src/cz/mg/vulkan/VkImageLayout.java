package cz.mg.vulkan;

public class VkImageLayout extends VkEnum {
    public static final int VK_IMAGE_LAYOUT_UNDEFINED = 0;
    public static final int VK_IMAGE_LAYOUT_GENERAL = 1;
    public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4;
    public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7;
    public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = 8;
    public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;
    public static final int VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR = 1000111000;
    public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR = 1000117000;
    public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR = 1000117001;

    public VkImageLayout() {
    }

    public VkImageLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImageLayout(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_LAYOUT_UNDEFINED) return "VK_IMAGE_LAYOUT_UNDEFINED";
        if(getValue() == VK_IMAGE_LAYOUT_GENERAL) return "VK_IMAGE_LAYOUT_GENERAL";
        if(getValue() == VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL) return "VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL";
        if(getValue() == VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL) return "VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL";
        if(getValue() == VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL) return "VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL";
        if(getValue() == VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL) return "VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL";
        if(getValue() == VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL) return "VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL";
        if(getValue() == VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL) return "VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL";
        if(getValue() == VK_IMAGE_LAYOUT_PREINITIALIZED) return "VK_IMAGE_LAYOUT_PREINITIALIZED";
        if(getValue() == VK_IMAGE_LAYOUT_PRESENT_SRC_KHR) return "VK_IMAGE_LAYOUT_PRESENT_SRC_KHR";
        if(getValue() == VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR) return "VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR";
        if(getValue() == VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR) return "VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR";
        if(getValue() == VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR) return "VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkImageLayout implements cz.mg.collections.array.ReadonlyArray<VkImageLayout> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageLayout.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageLayout o){
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
        public VkImageLayout get(int i){
            return new VkImageLayout(getVkMemory(), addressAt(i));
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

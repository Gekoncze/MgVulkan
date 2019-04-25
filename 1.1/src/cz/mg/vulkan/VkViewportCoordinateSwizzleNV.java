package cz.mg.vulkan;

public class VkViewportCoordinateSwizzleNV extends VkEnum {
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV = 0;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV = 1;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV = 2;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV = 3;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV = 4;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV = 5;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV = 6;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV = 7;

    public VkViewportCoordinateSwizzleNV() {
    }

    public VkViewportCoordinateSwizzleNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkViewportCoordinateSwizzleNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkViewportCoordinateSwizzleNV(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV";
        return "UNKNOWN";
    }

    public static class Array extends VkViewportCoordinateSwizzleNV implements cz.mg.collections.array.ReadonlyArray<VkViewportCoordinateSwizzleNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewportCoordinateSwizzleNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkViewportCoordinateSwizzleNV o){
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
        public VkViewportCoordinateSwizzleNV get(int i){
            return new VkViewportCoordinateSwizzleNV(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}

package cz.mg.vulkan;

public class VkPointClippingBehavior extends VkEnum {
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR = VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR = VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY;

    public VkPointClippingBehavior() {
    }

    protected VkPointClippingBehavior(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPointClippingBehavior(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPointClippingBehavior(int value) {
        setValue(value);
    }

    public VkPointClippingBehavior(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES) return "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY) return "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkPointClippingBehavior implements cz.mg.collections.array.ReadonlyArray<VkPointClippingBehavior> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPointClippingBehavior.sizeof()));
            this.count = count;
        }

        public Array(VkPointClippingBehavior o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
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
        public VkPointClippingBehavior get(int i){
            return new VkPointClippingBehavior(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}

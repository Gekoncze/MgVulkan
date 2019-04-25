package cz.mg.vulkan;

public class VkPointClippingBehaviorKHR extends VkEnum {
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR = 1;

    public VkPointClippingBehaviorKHR() {
    }

    protected VkPointClippingBehaviorKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPointClippingBehaviorKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPointClippingBehaviorKHR(int value) {
        setValue(value);
    }

    public VkPointClippingBehaviorKHR(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkPointClippingBehaviorKHR implements cz.mg.collections.array.ReadonlyArray<VkPointClippingBehaviorKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPointClippingBehaviorKHR.sizeof()));
            this.count = count;
        }

        public Array(VkPointClippingBehaviorKHR o, int count){
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
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPointClippingBehaviorKHR get(int i){
            return new VkPointClippingBehaviorKHR(getVkMemory(), address(i));
        }

        protected long address(int i){
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

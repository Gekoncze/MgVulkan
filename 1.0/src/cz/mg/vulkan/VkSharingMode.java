package cz.mg.vulkan;

public class VkSharingMode extends VkEnum {
    public static final int VK_SHARING_MODE_EXCLUSIVE = 0;
    public static final int VK_SHARING_MODE_CONCURRENT = 1;

    public VkSharingMode() {
    }

    public VkSharingMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSharingMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSharingMode(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SHARING_MODE_EXCLUSIVE) return "VK_SHARING_MODE_EXCLUSIVE";
        if(getValue() == VK_SHARING_MODE_CONCURRENT) return "VK_SHARING_MODE_CONCURRENT";
        return "UNKNOWN";
    }

    public static class Array extends VkSharingMode implements cz.mg.collections.array.ReadonlyArray<VkSharingMode> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSharingMode.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSharingMode o){
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
        public VkSharingMode get(int i){
            return new VkSharingMode(getVkMemory(), addressAt(i));
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

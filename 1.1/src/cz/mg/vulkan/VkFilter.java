package cz.mg.vulkan;

public class VkFilter extends VkEnum {
    public static final int VK_FILTER_NEAREST = 0;
    public static final int VK_FILTER_LINEAR = 1;
    public static final int VK_FILTER_CUBIC_IMG = 1000015000;

    public VkFilter() {
    }

    public VkFilter(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFilter(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFilter(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_FILTER_NEAREST) return "VK_FILTER_NEAREST";
        if(getValue() == VK_FILTER_LINEAR) return "VK_FILTER_LINEAR";
        if(getValue() == VK_FILTER_CUBIC_IMG) return "VK_FILTER_CUBIC_IMG";
        return "UNKNOWN";
    }

    public static class Array extends VkFilter implements cz.mg.collections.array.ReadonlyArray<VkFilter> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFilter.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFilter o){
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
        public VkFilter get(int i){
            return new VkFilter(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCullModeFlagBits.html">khronos documentation</a>
 **/
public class VkCullModeFlagBits extends VkFlagBits {
    public static final int VK_CULL_MODE_NONE = 0;
    public static final int VK_CULL_MODE_FRONT_BIT = 0x00000001;
    public static final int VK_CULL_MODE_BACK_BIT = 0x00000002;
    public static final int VK_CULL_MODE_FRONT_AND_BACK = 0x00000003;

    public VkCullModeFlagBits() {
    }

    public VkCullModeFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCullModeFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCullModeFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_CULL_MODE_NONE) s += "VK_CULL_MODE_NONE ";
        if(getValue() == VK_CULL_MODE_FRONT_BIT) s += "VK_CULL_MODE_FRONT_BIT ";
        if(getValue() == VK_CULL_MODE_BACK_BIT) s += "VK_CULL_MODE_BACK_BIT ";
        if(getValue() == VK_CULL_MODE_FRONT_AND_BACK) s += "VK_CULL_MODE_FRONT_AND_BACK ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkCullModeFlagBits implements cz.mg.collections.array.ReadonlyArray<VkCullModeFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCullModeFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCullModeFlagBits o){
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkCullModeFlagBits get(int i){
            return new VkCullModeFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkCullModeFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkCullModeFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

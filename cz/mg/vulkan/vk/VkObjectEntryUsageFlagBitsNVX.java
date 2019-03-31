package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectEntryUsageFlagBitsNVX.html">khronos documentation</a>
 **/
public class VkObjectEntryUsageFlagBitsNVX extends VkFlagBits {
    public static final int VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX = 0x00000001;
    public static final int VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX = 0x00000002;

    public VkObjectEntryUsageFlagBitsNVX() {
    }

    public VkObjectEntryUsageFlagBitsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectEntryUsageFlagBitsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkObjectEntryUsageFlagBitsNVX(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX) s += "VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX ";
        if(getValue() == VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX) s += "VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkObjectEntryUsageFlagBitsNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectEntryUsageFlagBitsNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkObjectEntryUsageFlagBitsNVX get(int i){
            return new VkObjectEntryUsageFlagBitsNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkObjectEntryUsageFlagBitsNVX[] a) {
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

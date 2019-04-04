package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassCreateFlags.html">khronos documentation</a>
 **/
public class VkRenderPassCreateFlags extends VkFlags {
    public VkRenderPassCreateFlags() {
    }

    public VkRenderPassCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkRenderPassCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkRenderPassCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkRenderPassCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkRenderPassCreateFlags o){
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
        public VkRenderPassCreateFlags get(int i){
            return new VkRenderPassCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkRenderPassCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRenderPassCreateFlags.Pointer> {
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

            public Array(VkRenderPassCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassCreateFlags.Pointer get(int i){
                return new VkRenderPassCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceImportFlags.html">khronos documentation</a>
 **/
public class VkFenceImportFlags extends VkFlags {
    public VkFenceImportFlags() {
    }

    public VkFenceImportFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFenceImportFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFenceImportFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkFenceImportFlags implements cz.mg.collections.array.ReadonlyArray<VkFenceImportFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFenceImportFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFenceImportFlags o){
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
        public VkFenceImportFlags get(int i){
            return new VkFenceImportFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkFenceImportFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkFenceImportFlags.Pointer> {
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

            public Array(VkFenceImportFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkFenceImportFlags.Pointer get(int i){
                return new VkFenceImportFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

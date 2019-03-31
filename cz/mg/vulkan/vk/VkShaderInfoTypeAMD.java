package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderInfoTypeAMD.html">khronos documentation</a>
 **/
public class VkShaderInfoTypeAMD extends VkEnum {
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;

    public VkShaderInfoTypeAMD() {
    }

    public VkShaderInfoTypeAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderInfoTypeAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkShaderInfoTypeAMD(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SHADER_INFO_TYPE_STATISTICS_AMD) return "VK_SHADER_INFO_TYPE_STATISTICS_AMD";
        if(getValue() == VK_SHADER_INFO_TYPE_BINARY_AMD) return "VK_SHADER_INFO_TYPE_BINARY_AMD";
        if(getValue() == VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD) return "VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD";
        return "UNKNOWN";
    }

    public static class Array extends VkShaderInfoTypeAMD implements cz.mg.collections.array.ReadonlyArray<VkShaderInfoTypeAMD> {
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
        public VkShaderInfoTypeAMD get(int i){
            return new VkShaderInfoTypeAMD(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkShaderInfoTypeAMD[] a) {
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

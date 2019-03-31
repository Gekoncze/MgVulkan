package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderModuleCreateInfo.html">khronos documentation</a>
 **/
public class VkShaderModuleCreateInfo extends VkObject {
    public VkShaderModuleCreateInfo() {
        super(sizeof());
    }

    public VkShaderModuleCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkShaderModuleCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkShaderModuleCreateInfo(VkObject pNext, VkShaderModuleCreateFlags flags, VkSize codeSize, VkUInt32 pCode) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setCodeSize(codeSize);
        setPCode(pCode);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkShaderModuleCreateFlags getFlags() {
        return new VkShaderModuleCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkShaderModuleCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkSize getCodeSize() {
        return new VkSize(getVkMemory(), getCodeSize(getVkAddress()));
    }

    public void setCodeSize(VkSize codeSize) {
        setCodeSize(getVkAddress(), codeSize.getVkAddress());
    }

    private static native long getCodeSize(long address);
    private static native void setCodeSize(long address, long codeSize);

    public VkUInt32 getPCode() {
        return new VkUInt32(getVkMemory(), getPCode(getVkAddress()));
    }

    public void setPCode(VkUInt32 pCode) {
        setPCode(getVkAddress(), pCode.getVkAddress());
    }

    private static native long getPCode(long address);
    private static native void setPCode(long address, long pCode);


    public static native long sizeof();

    public static class Array extends VkShaderModuleCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkShaderModuleCreateInfo> {
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
        public VkShaderModuleCreateInfo get(int i){
            return new VkShaderModuleCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkShaderModuleCreateInfo[] a) {
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

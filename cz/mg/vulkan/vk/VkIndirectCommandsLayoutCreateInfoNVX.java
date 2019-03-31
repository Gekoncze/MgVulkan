package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutCreateInfoNVX.html">khronos documentation</a>
 **/
public class VkIndirectCommandsLayoutCreateInfoNVX extends VkObject {
    public VkIndirectCommandsLayoutCreateInfoNVX() {
        super(sizeof());
    }

    public VkIndirectCommandsLayoutCreateInfoNVX(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkIndirectCommandsLayoutCreateInfoNVX(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkIndirectCommandsLayoutCreateInfoNVX(VkObject pNext, VkPipelineBindPoint pipelineBindPoint, VkIndirectCommandsLayoutUsageFlagsNVX flags, VkUInt32 tokenCount, VkIndirectCommandsLayoutTokenNVX pTokens) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX));
        setPNext(pNext);
        setPipelineBindPoint(pipelineBindPoint);
        setFlags(flags);
        setTokenCount(tokenCount);
        setPTokens(pTokens);
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

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPoint(getVkAddress()));
    }

    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPoint(getVkAddress(), pipelineBindPoint.getVkAddress());
    }

    private static native long getPipelineBindPoint(long address);
    private static native void setPipelineBindPoint(long address, long pipelineBindPoint);

    public VkIndirectCommandsLayoutUsageFlagsNVX getFlags() {
        return new VkIndirectCommandsLayoutUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkIndirectCommandsLayoutUsageFlagsNVX flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getTokenCount() {
        return new VkUInt32(getVkMemory(), getTokenCount(getVkAddress()));
    }

    public void setTokenCount(VkUInt32 tokenCount) {
        setTokenCount(getVkAddress(), tokenCount.getVkAddress());
    }

    private static native long getTokenCount(long address);
    private static native void setTokenCount(long address, long tokenCount);

    public VkIndirectCommandsLayoutTokenNVX.Array getPTokens() {
        return new VkIndirectCommandsLayoutTokenNVX.Array(getVkMemory(), getPTokens(getVkAddress()), getTokenCount().getValue());
    }

    public void setPTokens(VkIndirectCommandsLayoutTokenNVX pTokens) {
        setPTokens(getVkAddress(), pTokens.getVkAddress());
    }

    private static native long getPTokens(long address);
    private static native void setPTokens(long address, long pTokens);


    public static native long sizeof();

    public static class Array extends VkIndirectCommandsLayoutCreateInfoNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutCreateInfoNVX> {
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
        public VkIndirectCommandsLayoutCreateInfoNVX get(int i){
            return new VkIndirectCommandsLayoutCreateInfoNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkIndirectCommandsLayoutCreateInfoNVX[] a) {
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

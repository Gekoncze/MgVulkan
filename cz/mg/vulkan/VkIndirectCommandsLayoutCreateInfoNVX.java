package cz.mg.vulkan;

public class VkIndirectCommandsLayoutCreateInfoNVX extends VkObject {
    public VkIndirectCommandsLayoutCreateInfoNVX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX));
    }

    public VkIndirectCommandsLayoutCreateInfoNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndirectCommandsLayoutCreateInfoNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPoint(getVkAddress()));
    }

    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPoint(getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setPipelineBindPoint(int pipelineBindPoint) {
        getPipelineBindPoint().setValue(pipelineBindPoint);
    }

    private static native long getPipelineBindPoint(long address);
    private static native void setPipelineBindPoint(long address, long pipelineBindPoint);

    public VkIndirectCommandsLayoutUsageFlagsNVX getFlags() {
        return new VkIndirectCommandsLayoutUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkIndirectCommandsLayoutUsageFlagsNVX flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getTokenCount() {
        return new VkUInt32(getVkMemory(), getTokenCount(getVkAddress()));
    }

    
    public void setTokenCount(VkUInt32 tokenCount) {
        setTokenCount(getVkAddress(), tokenCount != null ? tokenCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setTokenCount(int tokenCount) {
        getTokenCount().setValue(tokenCount);
    }

    private static native long getTokenCount(long address);
    private static native void setTokenCount(long address, long tokenCount);

    public VkIndirectCommandsLayoutTokenNVX getPTokens() {
        return new VkIndirectCommandsLayoutTokenNVX(getVkMemory(), getPTokens(getVkAddress()));
    }

    private VkObject pTokens = null;
    public void setPTokens(VkIndirectCommandsLayoutTokenNVX pTokens) {
        setPTokens(getVkAddress(), pTokens != null ? pTokens.getVkAddress() : VkPointer.NULL);
        this.pTokens = pTokens;
    }

    private static native long getPTokens(long address);
    private static native void setPTokens(long address, long pTokens);


    public static native long sizeof();

    public static class Array extends VkIndirectCommandsLayoutCreateInfoNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutCreateInfoNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsLayoutCreateInfoNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkIndirectCommandsLayoutCreateInfoNVX o){
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

        public static class Array extends VkIndirectCommandsLayoutCreateInfoNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutCreateInfoNVX.Pointer> {
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

            public Array(VkIndirectCommandsLayoutCreateInfoNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkIndirectCommandsLayoutCreateInfoNVX.Pointer get(int i){
                return new VkIndirectCommandsLayoutCreateInfoNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

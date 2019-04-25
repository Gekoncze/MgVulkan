package cz.mg.vulkan;

public class VkRenderPassSampleLocationsBeginInfoEXT extends VkObject {
    public VkRenderPassSampleLocationsBeginInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT));
    }

    public VkRenderPassSampleLocationsBeginInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassSampleLocationsBeginInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkUInt32 getAttachmentInitialSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getAttachmentInitialSampleLocationsCount(getVkAddress()));
    }

    
    public void setAttachmentInitialSampleLocationsCount(VkUInt32 attachmentInitialSampleLocationsCount) {
        setAttachmentInitialSampleLocationsCount(getVkAddress(), attachmentInitialSampleLocationsCount != null ? attachmentInitialSampleLocationsCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getAttachmentInitialSampleLocationsCountQ() {
        return getAttachmentInitialSampleLocationsCount().getValue();
    }

    public void setAttachmentInitialSampleLocationsCount(int attachmentInitialSampleLocationsCount) {
        getAttachmentInitialSampleLocationsCount().setValue(attachmentInitialSampleLocationsCount);
    }

    protected static native long getAttachmentInitialSampleLocationsCount(long address);
    protected static native void setAttachmentInitialSampleLocationsCount(long address, long attachmentInitialSampleLocationsCount);

    public VkAttachmentSampleLocationsEXT getPAttachmentInitialSampleLocations() {
        return new VkAttachmentSampleLocationsEXT(getVkMemory(), getPAttachmentInitialSampleLocations(getVkAddress()));
    }

    private VkObject pAttachmentInitialSampleLocations = null;
    public void setPAttachmentInitialSampleLocations(VkAttachmentSampleLocationsEXT pAttachmentInitialSampleLocations) {
        setPAttachmentInitialSampleLocations(getVkAddress(), pAttachmentInitialSampleLocations != null ? pAttachmentInitialSampleLocations.getVkAddress() : VkPointer.NULL);
        this.pAttachmentInitialSampleLocations = pAttachmentInitialSampleLocations;
    }

    protected static native long getPAttachmentInitialSampleLocations(long address);
    protected static native void setPAttachmentInitialSampleLocations(long address, long pAttachmentInitialSampleLocations);

    public VkUInt32 getPostSubpassSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getPostSubpassSampleLocationsCount(getVkAddress()));
    }

    
    public void setPostSubpassSampleLocationsCount(VkUInt32 postSubpassSampleLocationsCount) {
        setPostSubpassSampleLocationsCount(getVkAddress(), postSubpassSampleLocationsCount != null ? postSubpassSampleLocationsCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPostSubpassSampleLocationsCountQ() {
        return getPostSubpassSampleLocationsCount().getValue();
    }

    public void setPostSubpassSampleLocationsCount(int postSubpassSampleLocationsCount) {
        getPostSubpassSampleLocationsCount().setValue(postSubpassSampleLocationsCount);
    }

    protected static native long getPostSubpassSampleLocationsCount(long address);
    protected static native void setPostSubpassSampleLocationsCount(long address, long postSubpassSampleLocationsCount);

    public VkSubpassSampleLocationsEXT getPPostSubpassSampleLocations() {
        return new VkSubpassSampleLocationsEXT(getVkMemory(), getPPostSubpassSampleLocations(getVkAddress()));
    }

    private VkObject pPostSubpassSampleLocations = null;
    public void setPPostSubpassSampleLocations(VkSubpassSampleLocationsEXT pPostSubpassSampleLocations) {
        setPPostSubpassSampleLocations(getVkAddress(), pPostSubpassSampleLocations != null ? pPostSubpassSampleLocations.getVkAddress() : VkPointer.NULL);
        this.pPostSubpassSampleLocations = pPostSubpassSampleLocations;
    }

    protected static native long getPPostSubpassSampleLocations(long address);
    protected static native void setPPostSubpassSampleLocations(long address, long pPostSubpassSampleLocations);


    public static native long sizeof();

    public static class Array extends VkRenderPassSampleLocationsBeginInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkRenderPassSampleLocationsBeginInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassSampleLocationsBeginInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT));;
        }

        public Array(int count, VkRenderPassSampleLocationsBeginInfoEXT o){
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
        public VkRenderPassSampleLocationsBeginInfoEXT get(int i){
            return new VkRenderPassSampleLocationsBeginInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkRenderPassSampleLocationsBeginInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRenderPassSampleLocationsBeginInfoEXT.Pointer> {
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

            public Array(VkRenderPassSampleLocationsBeginInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassSampleLocationsBeginInfoEXT.Pointer get(int i){
                return new VkRenderPassSampleLocationsBeginInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

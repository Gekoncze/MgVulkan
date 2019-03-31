package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassSampleLocationsBeginInfoEXT.html">khronos documentation</a>
 **/
public class VkRenderPassSampleLocationsBeginInfoEXT extends VkObject {
    public VkRenderPassSampleLocationsBeginInfoEXT() {
        super(sizeof());
    }

    public VkRenderPassSampleLocationsBeginInfoEXT(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkRenderPassSampleLocationsBeginInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkRenderPassSampleLocationsBeginInfoEXT(VkObject pNext, VkUInt32 attachmentInitialSampleLocationsCount, VkAttachmentSampleLocationsEXT pAttachmentInitialSampleLocations, VkUInt32 postSubpassSampleLocationsCount, VkSubpassSampleLocationsEXT pPostSubpassSampleLocations) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT));
        setPNext(pNext);
        setAttachmentInitialSampleLocationsCount(attachmentInitialSampleLocationsCount);
        setPAttachmentInitialSampleLocations(pAttachmentInitialSampleLocations);
        setPostSubpassSampleLocationsCount(postSubpassSampleLocationsCount);
        setPPostSubpassSampleLocations(pPostSubpassSampleLocations);
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

    public VkUInt32 getAttachmentInitialSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getAttachmentInitialSampleLocationsCount(getVkAddress()));
    }

    public void setAttachmentInitialSampleLocationsCount(VkUInt32 attachmentInitialSampleLocationsCount) {
        setAttachmentInitialSampleLocationsCount(getVkAddress(), attachmentInitialSampleLocationsCount.getVkAddress());
    }

    private static native long getAttachmentInitialSampleLocationsCount(long address);
    private static native void setAttachmentInitialSampleLocationsCount(long address, long attachmentInitialSampleLocationsCount);

    public VkAttachmentSampleLocationsEXT.Array getPAttachmentInitialSampleLocations() {
        return new VkAttachmentSampleLocationsEXT.Array(getVkMemory(), getPAttachmentInitialSampleLocations(getVkAddress()), getAttachmentInitialSampleLocationsCount().getValue());
    }

    public void setPAttachmentInitialSampleLocations(VkAttachmentSampleLocationsEXT pAttachmentInitialSampleLocations) {
        setPAttachmentInitialSampleLocations(getVkAddress(), pAttachmentInitialSampleLocations.getVkAddress());
    }

    private static native long getPAttachmentInitialSampleLocations(long address);
    private static native void setPAttachmentInitialSampleLocations(long address, long pAttachmentInitialSampleLocations);

    public VkUInt32 getPostSubpassSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getPostSubpassSampleLocationsCount(getVkAddress()));
    }

    public void setPostSubpassSampleLocationsCount(VkUInt32 postSubpassSampleLocationsCount) {
        setPostSubpassSampleLocationsCount(getVkAddress(), postSubpassSampleLocationsCount.getVkAddress());
    }

    private static native long getPostSubpassSampleLocationsCount(long address);
    private static native void setPostSubpassSampleLocationsCount(long address, long postSubpassSampleLocationsCount);

    public VkSubpassSampleLocationsEXT.Array getPPostSubpassSampleLocations() {
        return new VkSubpassSampleLocationsEXT.Array(getVkMemory(), getPPostSubpassSampleLocations(getVkAddress()), getPostSubpassSampleLocationsCount().getValue());
    }

    public void setPPostSubpassSampleLocations(VkSubpassSampleLocationsEXT pPostSubpassSampleLocations) {
        setPPostSubpassSampleLocations(getVkAddress(), pPostSubpassSampleLocations.getVkAddress());
    }

    private static native long getPPostSubpassSampleLocations(long address);
    private static native void setPPostSubpassSampleLocations(long address, long pPostSubpassSampleLocations);


    public static native long sizeof();

    public static class Array extends VkRenderPassSampleLocationsBeginInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkRenderPassSampleLocationsBeginInfoEXT> {
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

            public Array(VkRenderPassSampleLocationsBeginInfoEXT[] a) {
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

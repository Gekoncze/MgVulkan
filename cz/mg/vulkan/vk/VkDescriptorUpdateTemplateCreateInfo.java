package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplateCreateInfo.html">khronos documentation</a>
 **/
public class VkDescriptorUpdateTemplateCreateInfo extends VkObject {
    public VkDescriptorUpdateTemplateCreateInfo() {
        super(sizeof());
    }

    public VkDescriptorUpdateTemplateCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDescriptorUpdateTemplateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDescriptorUpdateTemplateCreateInfo(VkObject pNext, VkDescriptorUpdateTemplateCreateFlags flags, VkUInt32 descriptorUpdateEntryCount, VkDescriptorUpdateTemplateEntry pDescriptorUpdateEntries, VkDescriptorUpdateTemplateType templateType, VkDescriptorSetLayout descriptorSetLayout, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout pipelineLayout, VkUInt32 set) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setDescriptorUpdateEntryCount(descriptorUpdateEntryCount);
        setPDescriptorUpdateEntries(pDescriptorUpdateEntries);
        setTemplateType(templateType);
        setDescriptorSetLayout(descriptorSetLayout);
        setPipelineBindPoint(pipelineBindPoint);
        setPipelineLayout(pipelineLayout);
        setSet(set);
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

    public VkDescriptorUpdateTemplateCreateFlags getFlags() {
        return new VkDescriptorUpdateTemplateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkDescriptorUpdateTemplateCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getDescriptorUpdateEntryCount() {
        return new VkUInt32(getVkMemory(), getDescriptorUpdateEntryCount(getVkAddress()));
    }

    public void setDescriptorUpdateEntryCount(VkUInt32 descriptorUpdateEntryCount) {
        setDescriptorUpdateEntryCount(getVkAddress(), descriptorUpdateEntryCount.getVkAddress());
    }

    private static native long getDescriptorUpdateEntryCount(long address);
    private static native void setDescriptorUpdateEntryCount(long address, long descriptorUpdateEntryCount);

    public VkDescriptorUpdateTemplateEntry.Array getPDescriptorUpdateEntries() {
        return new VkDescriptorUpdateTemplateEntry.Array(getVkMemory(), getPDescriptorUpdateEntries(getVkAddress()), getDescriptorUpdateEntryCount().getValue());
    }

    public void setPDescriptorUpdateEntries(VkDescriptorUpdateTemplateEntry pDescriptorUpdateEntries) {
        setPDescriptorUpdateEntries(getVkAddress(), pDescriptorUpdateEntries.getVkAddress());
    }

    private static native long getPDescriptorUpdateEntries(long address);
    private static native void setPDescriptorUpdateEntries(long address, long pDescriptorUpdateEntries);

    public VkDescriptorUpdateTemplateType getTemplateType() {
        return new VkDescriptorUpdateTemplateType(getVkMemory(), getTemplateType(getVkAddress()));
    }

    public void setTemplateType(VkDescriptorUpdateTemplateType templateType) {
        setTemplateType(getVkAddress(), templateType.getVkAddress());
    }

    private static native long getTemplateType(long address);
    private static native void setTemplateType(long address, long templateType);

    public VkDescriptorSetLayout getDescriptorSetLayout() {
        return new VkDescriptorSetLayout(getVkMemory(), getDescriptorSetLayout(getVkAddress()));
    }

    public void setDescriptorSetLayout(VkDescriptorSetLayout descriptorSetLayout) {
        setDescriptorSetLayout(getVkAddress(), descriptorSetLayout.getVkAddress());
    }

    private static native long getDescriptorSetLayout(long address);
    private static native void setDescriptorSetLayout(long address, long descriptorSetLayout);

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPoint(getVkAddress()));
    }

    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPoint(getVkAddress(), pipelineBindPoint.getVkAddress());
    }

    private static native long getPipelineBindPoint(long address);
    private static native void setPipelineBindPoint(long address, long pipelineBindPoint);

    public VkPipelineLayout getPipelineLayout() {
        return new VkPipelineLayout(getVkMemory(), getPipelineLayout(getVkAddress()));
    }

    public void setPipelineLayout(VkPipelineLayout pipelineLayout) {
        setPipelineLayout(getVkAddress(), pipelineLayout.getVkAddress());
    }

    private static native long getPipelineLayout(long address);
    private static native void setPipelineLayout(long address, long pipelineLayout);

    public VkUInt32 getSet() {
        return new VkUInt32(getVkMemory(), getSet(getVkAddress()));
    }

    public void setSet(VkUInt32 set) {
        setSet(getVkAddress(), set.getVkAddress());
    }

    private static native long getSet(long address);
    private static native void setSet(long address, long set);


    public static native long sizeof();

    public static class Array extends VkDescriptorUpdateTemplateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateCreateInfo> {
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
        public VkDescriptorUpdateTemplateCreateInfo get(int i){
            return new VkDescriptorUpdateTemplateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkDescriptorUpdateTemplateCreateInfo[] a) {
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

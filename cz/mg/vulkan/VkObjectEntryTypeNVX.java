package cz.mg.vulkan;

public class VkObjectEntryTypeNVX extends VkEnum {
    public static final int VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX = 0;
    public static final int VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX = 1;
    public static final int VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX = 2;
    public static final int VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX = 3;
    public static final int VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX = 4;

    public VkObjectEntryTypeNVX() {
    }

    public VkObjectEntryTypeNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectEntryTypeNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkObjectEntryTypeNVX(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX) return "VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX";
        if(getValue() == VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX) return "VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX";
        if(getValue() == VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX) return "VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX";
        if(getValue() == VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX) return "VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX";
        if(getValue() == VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX) return "VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX";
        return "UNKNOWN";
    }

    public static class Array extends VkObjectEntryTypeNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectEntryTypeNVX> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectEntryTypeNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkObjectEntryTypeNVX o){
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
        public VkObjectEntryTypeNVX get(int i){
            return new VkObjectEntryTypeNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}

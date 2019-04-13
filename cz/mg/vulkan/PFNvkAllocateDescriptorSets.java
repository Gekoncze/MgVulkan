package cz.mg.vulkan;

public class PFNvkAllocateDescriptorSets extends VkFunctionPointer {
    public PFNvkAllocateDescriptorSets() {
    }

    public PFNvkAllocateDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkAllocateDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAllocateDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkAllocateDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkAllocateDescriptorSets"));
    }

    public void call(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, VkDescriptorSet pDescriptorSets, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), pAllocateInfo != null ? pAllocateInfo.getVkAddress() : VkPointer.NULL, pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pAllocateInfo, long pDescriptorSets, long rval);
}

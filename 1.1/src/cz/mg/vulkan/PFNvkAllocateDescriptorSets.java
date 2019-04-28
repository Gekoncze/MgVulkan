package cz.mg.vulkan;

public class PFNvkAllocateDescriptorSets extends VkFunctionPointer {
    public PFNvkAllocateDescriptorSets() {
    }

    protected PFNvkAllocateDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkAllocateDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAllocateDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkAllocateDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkAllocateDescriptorSets"));
    }

    public void call(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, VkDescriptorSet pDescriptorSets, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pAllocateInfo != null ? pAllocateInfo.getVkAddress() : VkPointer.NULL, pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pAllocateInfo, long pDescriptorSets, long rval);


    public int call(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, VkDescriptorSet pDescriptorSets){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pAllocateInfo != null ? pAllocateInfo.getVkAddress() : VkPointer.NULL, pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pAllocateInfo, long pDescriptorSets);

}

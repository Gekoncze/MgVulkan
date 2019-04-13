package cz.mg.vulkan;

public class PFNvkGetDescriptorSetLayoutSupportKHR extends VkFunctionPointer {
    public PFNvkGetDescriptorSetLayoutSupportKHR() {
    }

    public PFNvkGetDescriptorSetLayoutSupportKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDescriptorSetLayoutSupportKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDescriptorSetLayoutSupportKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDescriptorSetLayoutSupportKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDescriptorSetLayoutSupportKHR"));
    }

    public void call(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkDescriptorSetLayoutSupport pSupport){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pSupport != null ? pSupport.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pSupport);
}

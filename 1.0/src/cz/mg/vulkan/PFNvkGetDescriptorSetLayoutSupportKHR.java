package cz.mg.vulkan;

public class PFNvkGetDescriptorSetLayoutSupportKHR extends VkFunctionPointer {
    public PFNvkGetDescriptorSetLayoutSupportKHR() {
    }

    protected PFNvkGetDescriptorSetLayoutSupportKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDescriptorSetLayoutSupportKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDescriptorSetLayoutSupportKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDescriptorSetLayoutSupportKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDescriptorSetLayoutSupportKHR"));
    }

    public void call(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkDescriptorSetLayoutSupport pSupport){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pSupport != null ? pSupport.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pSupport);



}

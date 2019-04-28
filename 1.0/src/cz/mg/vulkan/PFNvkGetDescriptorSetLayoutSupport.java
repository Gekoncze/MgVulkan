package cz.mg.vulkan;

public class PFNvkGetDescriptorSetLayoutSupport extends VkFunctionPointer {
    public PFNvkGetDescriptorSetLayoutSupport() {
    }

    protected PFNvkGetDescriptorSetLayoutSupport(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDescriptorSetLayoutSupport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDescriptorSetLayoutSupport(long value) {
        setValue(value);
    }

    public PFNvkGetDescriptorSetLayoutSupport(VkInstance instance) {
        super(instance, new VkString("vkGetDescriptorSetLayoutSupport"));
    }

    public void call(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkDescriptorSetLayoutSupport pSupport){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pSupport != null ? pSupport.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pSupport);



}

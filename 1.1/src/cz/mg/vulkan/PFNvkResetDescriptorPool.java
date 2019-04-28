package cz.mg.vulkan;

public class PFNvkResetDescriptorPool extends VkFunctionPointer {
    public PFNvkResetDescriptorPool() {
    }

    protected PFNvkResetDescriptorPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkResetDescriptorPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkResetDescriptorPool(long value) {
        setValue(value);
    }

    public PFNvkResetDescriptorPool(VkInstance instance) {
        super(instance, new VkString("vkResetDescriptorPool"));
    }

    public int call(VkDevice device, VkDescriptorPool descriptorPool, int flags){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddressNative(), flags);
    }

    protected static native int callNative(long vkaddress, long device, long descriptorPool, int flags);

}

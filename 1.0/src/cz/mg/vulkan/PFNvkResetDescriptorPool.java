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

    public void call(VkDevice device, VkDescriptorPool descriptorPool, VkDescriptorPoolResetFlags flags, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long descriptorPool, long flags, long rval);
}

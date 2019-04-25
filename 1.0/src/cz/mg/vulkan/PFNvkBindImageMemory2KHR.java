package cz.mg.vulkan;

public class PFNvkBindImageMemory2KHR extends VkFunctionPointer {
    public PFNvkBindImageMemory2KHR() {
    }

    protected PFNvkBindImageMemory2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkBindImageMemory2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBindImageMemory2KHR(long value) {
        setValue(value);
    }

    public PFNvkBindImageMemory2KHR(VkInstance instance) {
        super(instance, new VkString("vkBindImageMemory2KHR"));
    }

    public void call(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfoKHR pBindInfos, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.getNullAddressNative(), pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long bindInfoCount, long pBindInfos, long rval);
}

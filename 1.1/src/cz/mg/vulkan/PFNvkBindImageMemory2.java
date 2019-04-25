package cz.mg.vulkan;

public class PFNvkBindImageMemory2 extends VkFunctionPointer {
    public PFNvkBindImageMemory2() {
    }

    protected PFNvkBindImageMemory2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkBindImageMemory2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBindImageMemory2(long value) {
        setValue(value);
    }

    public PFNvkBindImageMemory2(VkInstance instance) {
        super(instance, new VkString("vkBindImageMemory2"));
    }

    public void call(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.getNullAddressNative(), pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long bindInfoCount, long pBindInfos, long rval);
}

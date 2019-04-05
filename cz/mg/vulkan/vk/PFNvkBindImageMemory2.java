package cz.mg.vulkan.vk;

public class PFNvkBindImageMemory2 extends VkFunctionPointer {
    public PFNvkBindImageMemory2() {
    }

    public PFNvkBindImageMemory2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindImageMemory2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBindImageMemory2(long value) {
        setValue(value);
    }

    public PFNvkBindImageMemory2(VkInstance instance) {
        super(instance, new VkString("vkBindImageMemory2"));
    }

    public void call(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.NULL_ADDRESS, pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long bindInfoCount, long pBindInfos, long rval);
}

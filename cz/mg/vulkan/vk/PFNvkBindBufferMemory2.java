package cz.mg.vulkan.vk;

public class PFNvkBindBufferMemory2 extends VkFunctionPointer {
    public PFNvkBindBufferMemory2() {
    }

    public PFNvkBindBufferMemory2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindBufferMemory2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBindBufferMemory2(long value) {
        setValue(value);
    }

    public PFNvkBindBufferMemory2(VkInstance instance) {
        super(instance, new VkString("vkBindBufferMemory2"));
    }

    public void call(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.NULL_ADDRESS, pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long bindInfoCount, long pBindInfos, long rval);
}

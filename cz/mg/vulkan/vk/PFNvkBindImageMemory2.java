package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindImageMemory2.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.NULL, pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long bindInfoCount, long pBindInfos, long rval);
}

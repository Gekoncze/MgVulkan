package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindBufferMemory2KHR.html">khronos documentation</a>
 **/
public class PFNvkBindBufferMemory2KHR extends VkFunctionPointer {
    public PFNvkBindBufferMemory2KHR() {
    }

    public PFNvkBindBufferMemory2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindBufferMemory2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBindBufferMemory2KHR(long value) {
        setValue(value);
    }

    public PFNvkBindBufferMemory2KHR(VkInstance instance) {
        super(instance, new VkString("vkBindBufferMemory2KHR"));
    }

    public void call(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.NULL, pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long bindInfoCount, long pBindInfos, long rval);
}

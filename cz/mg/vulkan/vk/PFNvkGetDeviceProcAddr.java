package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceProcAddr.html">khronos documentation</a>
 **/
public class PFNvkGetDeviceProcAddr extends VkFunctionPointer {
    public PFNvkGetDeviceProcAddr() {
    }

    public PFNvkGetDeviceProcAddr(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceProcAddr(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetDeviceProcAddr(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceProcAddr(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceProcAddr"));
    }

    public void call(VkDevice device, VkChar pName, PFNvkVoidFunction rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pName != null ? pName.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pName, long rval);
}

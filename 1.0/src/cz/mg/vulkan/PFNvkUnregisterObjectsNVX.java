package cz.mg.vulkan;

public class PFNvkUnregisterObjectsNVX extends VkFunctionPointer {
    public PFNvkUnregisterObjectsNVX() {
    }

    protected PFNvkUnregisterObjectsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkUnregisterObjectsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkUnregisterObjectsNVX(long value) {
        setValue(value);
    }

    public PFNvkUnregisterObjectsNVX(VkInstance instance) {
        super(instance, new VkString("vkUnregisterObjectsNVX"));
    }

    public void call(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), objectTable != null ? objectTable.getVkAddress() : VkPointer.getNullAddressNative(), objectCount != null ? objectCount.getVkAddress() : VkPointer.getNullAddressNative(), pObjectEntryTypes != null ? pObjectEntryTypes.getVkAddress() : VkPointer.NULL, pObjectIndices != null ? pObjectIndices.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long objectTable, long objectCount, long pObjectEntryTypes, long pObjectIndices, long rval);
}

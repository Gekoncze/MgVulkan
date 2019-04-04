package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExportMemoryAllocateInfo.html">khronos documentation</a>
 **/
public class VulkanExportMemoryAllocateInfo extends VulkanObject {
    public VulkanExportMemoryAllocateInfo(){
        super(new VkExportMemoryAllocateInfo());
    }

    public VulkanExportMemoryAllocateInfo(VkExportMemoryAllocateInfo vk){
        super(vk);
    }

    @Override
    public VkExportMemoryAllocateInfo getVk(){
        return (VkExportMemoryAllocateInfo) super.getVk();
    }
    public VulkanExportMemoryAllocateInfo(VulkanObject pNext, VulkanExternalMemoryHandleTypeFlags handleTypes) {
        super(new VkExportMemoryAllocateInfo(pNext.getVk(), handleTypes.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlags getHandleTypes() {
        return new VulkanExternalMemoryHandleTypeFlags(getVk().getHandleTypes());
    }

    public void setHandleTypes(VulkanExternalMemoryHandleTypeFlags handleTypes) {
        getVk().setHandleTypes(handleTypes.getVk());
    }


    public static class Array extends VulkanExportMemoryAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanExportMemoryAllocateInfo> {
        public Array(VkExportMemoryAllocateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExportMemoryAllocateInfo.Array(count));
        }

        public Array(int count, VulkanExportMemoryAllocateInfo o){
            this(new VkExportMemoryAllocateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkExportMemoryAllocateInfo.Array getVk(){
            return (VkExportMemoryAllocateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExportMemoryAllocateInfo get(int i){
            return new VulkanExportMemoryAllocateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExportMemoryAllocateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExportMemoryAllocateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkExportMemoryAllocateInfo.Pointer(value));
        }

        @Override
        public VkExportMemoryAllocateInfo.Pointer getVk(){
            return (VkExportMemoryAllocateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanExportMemoryAllocateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExportMemoryAllocateInfo.Pointer> {
            public Array(int count) {
                super(new VkExportMemoryAllocateInfo.Pointer.Array(count));
            }

            public Array(VulkanExportMemoryAllocateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExportMemoryAllocateInfo.Pointer.Array getVk(){
                return (VkExportMemoryAllocateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExportMemoryAllocateInfo.Pointer get(int i){
                return new VulkanExportMemoryAllocateInfo.Pointer(getVk().get(i));
            }
        }
    }
}

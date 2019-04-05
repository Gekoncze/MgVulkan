package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExportMemoryAllocateInfoNV extends VulkanObject {
    public VulkanExportMemoryAllocateInfoNV(){
        super(new VkExportMemoryAllocateInfoNV());
    }

    public VulkanExportMemoryAllocateInfoNV(VkExportMemoryAllocateInfoNV vk){
        super(vk);
    }

    @Override
    public VkExportMemoryAllocateInfoNV getVk(){
        return (VkExportMemoryAllocateInfoNV) super.getVk();
    }
    public VulkanExportMemoryAllocateInfoNV(VulkanObject pNext, VulkanExternalMemoryHandleTypeFlagsNV handleTypes) {
        super(new VkExportMemoryAllocateInfoNV(pNext.getVk(), handleTypes.getVk()));
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

    public VulkanExternalMemoryHandleTypeFlagsNV getHandleTypes() {
        return new VulkanExternalMemoryHandleTypeFlagsNV(getVk().getHandleTypes());
    }

    public void setHandleTypes(VulkanExternalMemoryHandleTypeFlagsNV handleTypes) {
        getVk().setHandleTypes(handleTypes.getVk());
    }


    public static class Array extends VulkanExportMemoryAllocateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanExportMemoryAllocateInfoNV> {
        public Array(VkExportMemoryAllocateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExportMemoryAllocateInfoNV.Array(count));
        }

        public Array(int count, VulkanExportMemoryAllocateInfoNV o){
            this(new VkExportMemoryAllocateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkExportMemoryAllocateInfoNV.Array getVk(){
            return (VkExportMemoryAllocateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExportMemoryAllocateInfoNV get(int i){
            return new VulkanExportMemoryAllocateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExportMemoryAllocateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExportMemoryAllocateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkExportMemoryAllocateInfoNV.Pointer(value));
        }

        @Override
        public VkExportMemoryAllocateInfoNV.Pointer getVk(){
            return (VkExportMemoryAllocateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanExportMemoryAllocateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExportMemoryAllocateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkExportMemoryAllocateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanExportMemoryAllocateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExportMemoryAllocateInfoNV.Pointer.Array getVk(){
                return (VkExportMemoryAllocateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExportMemoryAllocateInfoNV.Pointer get(int i){
                return new VulkanExportMemoryAllocateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExportSemaphoreCreateInfo.html">khronos documentation</a>
 **/
public class VulkanExportSemaphoreCreateInfo extends VulkanObject {
    public VulkanExportSemaphoreCreateInfo(){
        super(new VkExportSemaphoreCreateInfo());
    }

    public VulkanExportSemaphoreCreateInfo(VkExportSemaphoreCreateInfo vk){
        super(vk);
    }

    @Override
    public VkExportSemaphoreCreateInfo getVk(){
        return (VkExportSemaphoreCreateInfo) super.getVk();
    }
    public VulkanExportSemaphoreCreateInfo(VulkanObject pNext, VulkanExternalSemaphoreHandleTypeFlags handleTypes) {
        super(new VkExportSemaphoreCreateInfo(pNext.getVk(), handleTypes.getVk()));
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

    public VulkanExternalSemaphoreHandleTypeFlags getHandleTypes() {
        return new VulkanExternalSemaphoreHandleTypeFlags(getVk().getHandleTypes());
    }

    public void setHandleTypes(VulkanExternalSemaphoreHandleTypeFlags handleTypes) {
        getVk().setHandleTypes(handleTypes.getVk());
    }


    public static class Array extends VulkanExportSemaphoreCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanExportSemaphoreCreateInfo> {
        public Array(VkExportSemaphoreCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExportSemaphoreCreateInfo.Array(count));
        }

        public Array(int count, VulkanExportSemaphoreCreateInfo o){
            this(new VkExportSemaphoreCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkExportSemaphoreCreateInfo.Array getVk(){
            return (VkExportSemaphoreCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExportSemaphoreCreateInfo get(int i){
            return new VulkanExportSemaphoreCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExportSemaphoreCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExportSemaphoreCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkExportSemaphoreCreateInfo.Pointer(value));
        }

        @Override
        public VkExportSemaphoreCreateInfo.Pointer getVk(){
            return (VkExportSemaphoreCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanExportSemaphoreCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExportSemaphoreCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkExportSemaphoreCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanExportSemaphoreCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExportSemaphoreCreateInfo.Pointer.Array getVk(){
                return (VkExportSemaphoreCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExportSemaphoreCreateInfo.Pointer get(int i){
                return new VulkanExportSemaphoreCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}

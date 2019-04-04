package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphoreCreateInfo.html">khronos documentation</a>
 **/
public class VulkanSemaphoreCreateInfo extends VulkanObject {
    public VulkanSemaphoreCreateInfo(){
        super(new VkSemaphoreCreateInfo());
    }

    public VulkanSemaphoreCreateInfo(VkSemaphoreCreateInfo vk){
        super(vk);
    }

    @Override
    public VkSemaphoreCreateInfo getVk(){
        return (VkSemaphoreCreateInfo) super.getVk();
    }
    public VulkanSemaphoreCreateInfo(VulkanObject pNext, VulkanSemaphoreCreateFlags flags) {
        super(new VkSemaphoreCreateInfo(pNext.getVk(), flags.getVk()));
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

    public VulkanSemaphoreCreateFlags getFlags() {
        return new VulkanSemaphoreCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanSemaphoreCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanSemaphoreCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreCreateInfo> {
        public Array(VkSemaphoreCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSemaphoreCreateInfo.Array(count));
        }

        public Array(int count, VulkanSemaphoreCreateInfo o){
            this(new VkSemaphoreCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSemaphoreCreateInfo.Array getVk(){
            return (VkSemaphoreCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSemaphoreCreateInfo get(int i){
            return new VulkanSemaphoreCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSemaphoreCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSemaphoreCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSemaphoreCreateInfo.Pointer(value));
        }

        @Override
        public VkSemaphoreCreateInfo.Pointer getVk(){
            return (VkSemaphoreCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSemaphoreCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkSemaphoreCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanSemaphoreCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSemaphoreCreateInfo.Pointer.Array getVk(){
                return (VkSemaphoreCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSemaphoreCreateInfo.Pointer get(int i){
                return new VulkanSemaphoreCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayPresentInfoKHR extends VulkanObject {
    public VulkanDisplayPresentInfoKHR(){
        super(new VkDisplayPresentInfoKHR());
    }

    public VulkanDisplayPresentInfoKHR(VkDisplayPresentInfoKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayPresentInfoKHR getVk(){
        return (VkDisplayPresentInfoKHR) super.getVk();
    }
    public VulkanDisplayPresentInfoKHR(VulkanObject pNext, VulkanRect2D srcRect, VulkanRect2D dstRect, VulkanBool32 persistent) {
        super(new VkDisplayPresentInfoKHR(pNext.getVk(), srcRect.getVk(), dstRect.getVk(), persistent.getVk()));
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

    public VulkanRect2D getSrcRect() {
        return new VulkanRect2D(getVk().getSrcRect());
    }

    public void setSrcRect(VulkanRect2D srcRect) {
        getVk().setSrcRect(srcRect.getVk());
    }

    public VulkanRect2D getDstRect() {
        return new VulkanRect2D(getVk().getDstRect());
    }

    public void setDstRect(VulkanRect2D dstRect) {
        getVk().setDstRect(dstRect.getVk());
    }

    public VulkanBool32 getPersistent() {
        return new VulkanBool32(getVk().getPersistent());
    }

    public void setPersistent(VulkanBool32 persistent) {
        getVk().setPersistent(persistent.getVk());
    }


    public static class Array extends VulkanDisplayPresentInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPresentInfoKHR> {
        public Array(VkDisplayPresentInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayPresentInfoKHR.Array(count));
        }

        public Array(int count, VulkanDisplayPresentInfoKHR o){
            this(new VkDisplayPresentInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayPresentInfoKHR.Array getVk(){
            return (VkDisplayPresentInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayPresentInfoKHR get(int i){
            return new VulkanDisplayPresentInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayPresentInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayPresentInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayPresentInfoKHR.Pointer(value));
        }

        @Override
        public VkDisplayPresentInfoKHR.Pointer getVk(){
            return (VkDisplayPresentInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayPresentInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPresentInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayPresentInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayPresentInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayPresentInfoKHR.Pointer.Array getVk(){
                return (VkDisplayPresentInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayPresentInfoKHR.Pointer get(int i){
                return new VulkanDisplayPresentInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}

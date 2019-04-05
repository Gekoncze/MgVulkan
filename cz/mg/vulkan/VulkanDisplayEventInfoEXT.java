package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayEventInfoEXT extends VulkanObject {
    public VulkanDisplayEventInfoEXT(){
        super(new VkDisplayEventInfoEXT());
    }

    public VulkanDisplayEventInfoEXT(VkDisplayEventInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDisplayEventInfoEXT getVk(){
        return (VkDisplayEventInfoEXT) super.getVk();
    }
    public VulkanDisplayEventInfoEXT(VulkanObject pNext, VulkanDisplayEventTypeEXT displayEvent) {
        super(new VkDisplayEventInfoEXT(pNext.getVk(), displayEvent.getVk()));
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

    public VulkanDisplayEventTypeEXT getDisplayEvent() {
        return new VulkanDisplayEventTypeEXT(getVk().getDisplayEvent());
    }

    public void setDisplayEvent(VulkanDisplayEventTypeEXT displayEvent) {
        getVk().setDisplayEvent(displayEvent.getVk());
    }


    public static class Array extends VulkanDisplayEventInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayEventInfoEXT> {
        public Array(VkDisplayEventInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayEventInfoEXT.Array(count));
        }

        public Array(int count, VulkanDisplayEventInfoEXT o){
            this(new VkDisplayEventInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayEventInfoEXT.Array getVk(){
            return (VkDisplayEventInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayEventInfoEXT get(int i){
            return new VulkanDisplayEventInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayEventInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayEventInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayEventInfoEXT.Pointer(value));
        }

        @Override
        public VkDisplayEventInfoEXT.Pointer getVk(){
            return (VkDisplayEventInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayEventInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayEventInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDisplayEventInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDisplayEventInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayEventInfoEXT.Pointer.Array getVk(){
                return (VkDisplayEventInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayEventInfoEXT.Pointer get(int i){
                return new VulkanDisplayEventInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}

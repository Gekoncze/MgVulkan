package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceEventInfoEXT extends VulkanObject {
    public VulkanDeviceEventInfoEXT(){
        super(new VkDeviceEventInfoEXT());
    }

    public VulkanDeviceEventInfoEXT(VkDeviceEventInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDeviceEventInfoEXT getVk(){
        return (VkDeviceEventInfoEXT) super.getVk();
    }
    public VulkanDeviceEventInfoEXT(VulkanObject pNext, VulkanDeviceEventTypeEXT deviceEvent) {
        super(new VkDeviceEventInfoEXT(pNext.getVk(), deviceEvent.getVk()));
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

    public VulkanDeviceEventTypeEXT getDeviceEvent() {
        return new VulkanDeviceEventTypeEXT(getVk().getDeviceEvent());
    }

    public void setDeviceEvent(VulkanDeviceEventTypeEXT deviceEvent) {
        getVk().setDeviceEvent(deviceEvent.getVk());
    }


    public static class Array extends VulkanDeviceEventInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceEventInfoEXT> {
        public Array(VkDeviceEventInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceEventInfoEXT.Array(count));
        }

        public Array(int count, VulkanDeviceEventInfoEXT o){
            this(new VkDeviceEventInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceEventInfoEXT.Array getVk(){
            return (VkDeviceEventInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceEventInfoEXT get(int i){
            return new VulkanDeviceEventInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceEventInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceEventInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceEventInfoEXT.Pointer(value));
        }

        @Override
        public VkDeviceEventInfoEXT.Pointer getVk(){
            return (VkDeviceEventInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceEventInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceEventInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDeviceEventInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDeviceEventInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceEventInfoEXT.Pointer.Array getVk(){
                return (VkDeviceEventInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceEventInfoEXT.Pointer get(int i){
                return new VulkanDeviceEventInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPowerInfoEXT.html">khronos documentation</a>
 **/
public class VulkanDisplayPowerInfoEXT extends VulkanObject {
    public VulkanDisplayPowerInfoEXT(){
        super(new VkDisplayPowerInfoEXT());
    }

    public VulkanDisplayPowerInfoEXT(VkDisplayPowerInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDisplayPowerInfoEXT getVk(){
        return (VkDisplayPowerInfoEXT) super.getVk();
    }
    public VulkanDisplayPowerInfoEXT(VulkanObject pNext, VulkanDisplayPowerStateEXT powerState) {
        super(new VkDisplayPowerInfoEXT(pNext.getVk(), powerState.getVk()));
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

    public VulkanDisplayPowerStateEXT getPowerState() {
        return new VulkanDisplayPowerStateEXT(getVk().getPowerState());
    }

    public void setPowerState(VulkanDisplayPowerStateEXT powerState) {
        getVk().setPowerState(powerState.getVk());
    }


    public static class Array extends VulkanDisplayPowerInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPowerInfoEXT> {
        public Array(VkDisplayPowerInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayPowerInfoEXT.Array(count));
        }

        public Array(int count, VulkanDisplayPowerInfoEXT o){
            this(new VkDisplayPowerInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayPowerInfoEXT.Array getVk(){
            return (VkDisplayPowerInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayPowerInfoEXT get(int i){
            return new VulkanDisplayPowerInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayPowerInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayPowerInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayPowerInfoEXT.Pointer(value));
        }

        @Override
        public VkDisplayPowerInfoEXT.Pointer getVk(){
            return (VkDisplayPowerInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayPowerInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPowerInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDisplayPowerInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDisplayPowerInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayPowerInfoEXT.Pointer.Array getVk(){
                return (VkDisplayPowerInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayPowerInfoEXT.Pointer get(int i){
                return new VulkanDisplayPowerInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}

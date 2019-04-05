package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanValidationFlagsEXT extends VulkanObject {
    public VulkanValidationFlagsEXT(){
        super(new VkValidationFlagsEXT());
    }

    public VulkanValidationFlagsEXT(VkValidationFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkValidationFlagsEXT getVk(){
        return (VkValidationFlagsEXT) super.getVk();
    }

    public VulkanValidationFlagsEXT(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 disabledValidationCheckCount, VulkanValidationCheckEXT pDisabledValidationChecks) {
        super(new VkValidationFlagsEXT(sType.getVk(), pNext.getVk(), disabledValidationCheckCount.getVk(), pDisabledValidationChecks.getVk()));
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

    public VulkanUInt32 getDisabledValidationCheckCount() {
        return new VulkanUInt32(getVk().getDisabledValidationCheckCount());
    }

    public void setDisabledValidationCheckCount(VulkanUInt32 disabledValidationCheckCount) {
        getVk().setDisabledValidationCheckCount(disabledValidationCheckCount.getVk());
    }

    public VulkanValidationCheckEXT getPDisabledValidationChecks() {
        return new VulkanValidationCheckEXT(getVk().getPDisabledValidationChecks());
    }

    public void setPDisabledValidationChecks(VulkanValidationCheckEXT pDisabledValidationChecks) {
        getVk().setPDisabledValidationChecks(pDisabledValidationChecks.getVk());
    }


    public static class Array extends VulkanValidationFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanValidationFlagsEXT> {
        public Array(VkValidationFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkValidationFlagsEXT.Array(count));
        }

        public Array(int count, VulkanValidationFlagsEXT o){
            this(new VkValidationFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkValidationFlagsEXT.Array getVk(){
            return (VkValidationFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanValidationFlagsEXT get(int i){
            return new VulkanValidationFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkValidationFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkValidationFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkValidationFlagsEXT.Pointer(value));
        }

        @Override
        public VkValidationFlagsEXT.Pointer getVk(){
            return (VkValidationFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanValidationFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanValidationFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkValidationFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanValidationFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkValidationFlagsEXT.Pointer.Array getVk(){
                return (VkValidationFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanValidationFlagsEXT.Pointer get(int i){
                return new VulkanValidationFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}

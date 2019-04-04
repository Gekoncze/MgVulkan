package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPastPresentationTimingGOOGLE.html">khronos documentation</a>
 **/
public class VulkanPastPresentationTimingGOOGLE extends VulkanObject {
    public VulkanPastPresentationTimingGOOGLE(){
        super(new VkPastPresentationTimingGOOGLE());
    }

    public VulkanPastPresentationTimingGOOGLE(VkPastPresentationTimingGOOGLE vk){
        super(vk);
    }

    @Override
    public VkPastPresentationTimingGOOGLE getVk(){
        return (VkPastPresentationTimingGOOGLE) super.getVk();
    }

    public VulkanPastPresentationTimingGOOGLE(VulkanUInt32 presentID, VulkanUInt64 desiredPresentTime, VulkanUInt64 actualPresentTime, VulkanUInt64 earliestPresentTime, VulkanUInt64 presentMargin) {
        super(new VkPastPresentationTimingGOOGLE(presentID.getVk(), desiredPresentTime.getVk(), actualPresentTime.getVk(), earliestPresentTime.getVk(), presentMargin.getVk()));
    }

    public VulkanUInt32 getPresentID() {
        return new VulkanUInt32(getVk().getPresentID());
    }

    public void setPresentID(VulkanUInt32 presentID) {
        getVk().setPresentID(presentID.getVk());
    }

    public VulkanUInt64 getDesiredPresentTime() {
        return new VulkanUInt64(getVk().getDesiredPresentTime());
    }

    public void setDesiredPresentTime(VulkanUInt64 desiredPresentTime) {
        getVk().setDesiredPresentTime(desiredPresentTime.getVk());
    }

    public VulkanUInt64 getActualPresentTime() {
        return new VulkanUInt64(getVk().getActualPresentTime());
    }

    public void setActualPresentTime(VulkanUInt64 actualPresentTime) {
        getVk().setActualPresentTime(actualPresentTime.getVk());
    }

    public VulkanUInt64 getEarliestPresentTime() {
        return new VulkanUInt64(getVk().getEarliestPresentTime());
    }

    public void setEarliestPresentTime(VulkanUInt64 earliestPresentTime) {
        getVk().setEarliestPresentTime(earliestPresentTime.getVk());
    }

    public VulkanUInt64 getPresentMargin() {
        return new VulkanUInt64(getVk().getPresentMargin());
    }

    public void setPresentMargin(VulkanUInt64 presentMargin) {
        getVk().setPresentMargin(presentMargin.getVk());
    }


    public static class Array extends VulkanPastPresentationTimingGOOGLE implements cz.mg.collections.array.ReadonlyArray<VulkanPastPresentationTimingGOOGLE> {
        public Array(VkPastPresentationTimingGOOGLE.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPastPresentationTimingGOOGLE.Array(count));
        }

        public Array(int count, VulkanPastPresentationTimingGOOGLE o){
            this(new VkPastPresentationTimingGOOGLE.Array(count, o.getVk()));
        }

        @Override
        public VkPastPresentationTimingGOOGLE.Array getVk(){
            return (VkPastPresentationTimingGOOGLE.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPastPresentationTimingGOOGLE get(int i){
            return new VulkanPastPresentationTimingGOOGLE(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPastPresentationTimingGOOGLE.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPastPresentationTimingGOOGLE.Pointer());
        }

        public Pointer(long value) {
            this(new VkPastPresentationTimingGOOGLE.Pointer(value));
        }

        @Override
        public VkPastPresentationTimingGOOGLE.Pointer getVk(){
            return (VkPastPresentationTimingGOOGLE.Pointer) super.getVk();
        }

        public static class Array extends VulkanPastPresentationTimingGOOGLE.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPastPresentationTimingGOOGLE.Pointer> {
            public Array(int count) {
                super(new VkPastPresentationTimingGOOGLE.Pointer.Array(count));
            }

            public Array(VulkanPastPresentationTimingGOOGLE[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPastPresentationTimingGOOGLE.Pointer.Array getVk(){
                return (VkPastPresentationTimingGOOGLE.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPastPresentationTimingGOOGLE.Pointer get(int i){
                return new VulkanPastPresentationTimingGOOGLE.Pointer(getVk().get(i));
            }
        }
    }
}
